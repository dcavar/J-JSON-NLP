
package org.nlp_lab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Miscellaneous features, corresponding to the ConLL format
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class Misc {

    /**
     * Space after token
     *
     */
    @JsonProperty("spaceAfter")
    @JsonPropertyDescription("Space after token")
    private boolean SpaceAfter;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Misc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Misc) == false) {
            return false;
        }
        Misc rhs = ((Misc) other);
        return true;
    }

}
