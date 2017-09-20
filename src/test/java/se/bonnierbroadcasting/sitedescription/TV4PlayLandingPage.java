package se.bonnierbroadcasting.sitedescription;

import se.claremont.autotest.websupport.DomElement;

/**
 * Created by jordam on 2017-04-02.
 */
public class TV4PlayLandingPage {

    public static DomElement menuLinkProgram(){
        return new DomElement("href=\"/program/tags\"", DomElement.IdentificationType.BY_ATTRIBUTE_VALUE);
    }
}
