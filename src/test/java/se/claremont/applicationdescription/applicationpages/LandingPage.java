package se.claremont.applicationdescription.applicationpages;

import se.claremont.autotest.websupport.DomElement;

/**
 * Created by jordam on 2016-12-04.
 */
public class LandingPage {

    public static DomElement englishFlag(){
        return new DomElement("In English", DomElement.IdentificationType.BY_LINK_TEXT );
    }

    public static DomElement contactsLink(){
        return new DomElement("Kontakt", DomElement.IdentificationType.BY_LINK_TEXT );
    }
}
