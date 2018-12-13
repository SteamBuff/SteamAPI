package org.steambuff;

import org.steambuff.driver.DriverInterface;
import org.steambuff.driver.Params;
import org.steambuff.exception.SteamApiException;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Tester driver.
 */
public class TesterDriver implements DriverInterface {

    private String url;

    private List<ReactionDriver> getReaction = new ArrayList<>();
    private List<ReactionDriver> postReaction = new ArrayList<>();

    /**
     * Instantiates a new Tester driver.
     *
     * @param url the url
     */
    public TesterDriver(String url) {
        this.url = url;
    }


    /**
     * Add reaction tester driver.
     *
     * @param reactionDriver the reaction driver
     * @return the tester driver
     */
    public TesterDriver addReaction(ReactionDriver reactionDriver) {

        if (reactionDriver.getMethod().equals("GET")) {
            getReaction.add(reactionDriver);
        } else if (reactionDriver.getMethod().equals("POST")) {
            postReaction.add(reactionDriver);
        }
        return this;
    }


    @Override
    public String getData(String url, Params params, String method) throws SteamApiException {
        if (!url.equals(this.url)) {
            throw new SteamApiException("Undefined URL");
        }
        if (method.equals("GET")) {
            return processGET(params);
        } else if (method.equals("POST")) {
            return processPOST(params);
        }
        throw new SteamApiException("Undefined method");
    }

    private String processPOST(Params params) {
        return null;
    }


    private String processGET(Params params) throws SteamApiException {
        for (ReactionDriver reactionDriver : getReaction) {
            if (params.toString().equals(reactionDriver.getParams().toString())) {
                return ResourceHelper.getJSON(reactionDriver.getJSON());
            }
        }
        throw new SteamApiException("Undefined reaction for: " + url+ params.toString());
    }

    @Override
    public DriverInterface useHttps(boolean useHttps) {
        return null;
    }
}
