/**
 * Meta.java
 * <p>
 * (C) 2019 by Damir Cavar
 */
package org.nlplab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "DC.conformsTo",
        "DC.source",
        "DC.created",
        "DC.date",
        "DC.creator",
        "DC.publisher",
        "DC.title",
        "DC.description",
        "DC.identifier",
        "DC.language",
        "DC.subject",
        "DC.contributors",
        "DC.type",
        "DC.format",
        "DC.relation",
        "DC.coverage",
        "DC.rights",
        "counts"
})
public class Meta {

    /**
     * The NLP-JSON Schema Version
     * (Required)
     *
     */
    @JsonProperty("DC.conformsTo")
    @JsonPropertyDescription("The NLP-JSON Schema Version")
    private String dCConformsTo;
    /**
     * The NLP system from which this document was created
     *
     */
    @JsonProperty("DC.source")
    @JsonPropertyDescription("The NLP system from which this document was created")
    private String dCSource;
    /**
     * The parse time of the document, in ISO 8601 format
     *
     */
    @JsonProperty("DC.created")
    @JsonPropertyDescription("The parse time of the document, in ISO 8601 format")
    private String dCCreated;
    /**
     * The time of the most recent modification to the document, in ISO 8601 format
     *
     */
    @JsonProperty("DC.date")
    @JsonPropertyDescription("The time of the most recent modification to the document, in ISO 8601 format")
    private String dCDate;
    /**
     * The person at whose behest the document was parsed
     *
     */
    @JsonProperty("DC.creator")
    @JsonPropertyDescription("The person at whose behest the document was parsed")
    private String dCCreator;
    /**
     * Organization associated with this parse
     *
     */
    @JsonProperty("DC.publisher")
    @JsonPropertyDescription("Organization associated with this parse")
    private String dCPublisher;
    /**
     * The title of the document parsed
     *
     */
    @JsonProperty("DC.title")
    @JsonPropertyDescription("The title of the document parsed")
    private String dCTitle;
    @JsonProperty("DC.description")
    private String dCDescription;
    /**
     * Complete reference to the original document that was parsed
     *
     */
    @JsonProperty("DC.identifier")
    @JsonPropertyDescription("Complete reference to the original document that was parsed")
    private String dCIdentifier;
    /**
     * ISO 639-1 or 639-2 language specification
     *
     */
    @JsonProperty("DC.language")
    @JsonPropertyDescription("ISO 639-1 or 639-2 language specification")
    private String dCLanguage;
    @JsonProperty("DC.subject")
    private String dCSubject;
    @JsonProperty("DC.contributors")
    private String dCContributors;
    @JsonProperty("DC.type")
    private String dCType;
    @JsonProperty("DC.format")
    private String dCFormat;
    @JsonProperty("DC.relation")
    private String dCRelation;
    @JsonProperty("DC.coverage")
    private String dCCoverage;
    @JsonProperty("DC.rights")
    private String dCRights;
    @JsonProperty("counts")
    private Counts counts;

    /**
     * The NLP-JSON Schema Version
     *
     */
    @JsonProperty("DC.conformsTo")
    public String getDCConformsTo() {
        return dCConformsTo;
    }

    /**
     * The NLP-JSON Schema Version
     *
     */
    @JsonProperty("DC.conformsTo")
    public void setDCConformsTo(String dCConformsTo) {
        this.dCConformsTo = dCConformsTo;
    }

    /**
     * The NLP system from which this document was created
     *
     */
    @JsonProperty("DC.source")
    public String getDCSource() {
        return dCSource;
    }

    /**
     * The NLP system from which this document was created
     *
     */
    @JsonProperty("DC.source")
    public void setDCSource(String dCSource) {
        this.dCSource = dCSource;
    }

    /**
     * The parse time of the document, in ISO 8601 format
     *
     */
    @JsonProperty("DC.created")
    public String getDCCreated() {
        return dCCreated;
    }

    /**
     * The parse time of the document, in ISO 8601 format
     *
     */
    @JsonProperty("DC.created")
    public void setDCCreated(String dCCreated) {
        this.dCCreated = dCCreated;
    }

    /**
     * The time of the most recent modification to the document, in ISO 8601 format
     *
     */
    @JsonProperty("DC.date")
    public String getDCDate() {
        return dCDate;
    }

    /**
     * The time of the most recent modification to the document, in ISO 8601 format
     *
     */
    @JsonProperty("DC.date")
    public void setDCDate(String dCDate) {
        this.dCDate = dCDate;
    }

    /**
     * The person at whose behest the document was parsed
     *
     */
    @JsonProperty("DC.creator")
    public String getDCCreator() {
        return dCCreator;
    }

    /**
     * The person at whose behest the document was parsed
     *
     */
    @JsonProperty("DC.creator")
    public void setDCCreator(String dCCreator) {
        this.dCCreator = dCCreator;
    }

    /**
     * Organization associated with this parse
     *
     */
    @JsonProperty("DC.publisher")
    public String getDCPublisher() {
        return dCPublisher;
    }

    /**
     * Organization associated with this parse
     *
     */
    @JsonProperty("DC.publisher")
    public void setDCPublisher(String dCPublisher) {
        this.dCPublisher = dCPublisher;
    }

    /**
     * The title of the document parsed
     *
     */
    @JsonProperty("DC.title")
    public String getDCTitle() {
        return dCTitle;
    }

    /**
     * The title of the document parsed
     *
     */
    @JsonProperty("DC.title")
    public void setDCTitle(String dCTitle) {
        this.dCTitle = dCTitle;
    }

    @JsonProperty("DC.description")
    public String getDCDescription() {
        return dCDescription;
    }

    @JsonProperty("DC.description")
    public void setDCDescription(String dCDescription) {
        this.dCDescription = dCDescription;
    }

    /**
     * Complete reference to the original document that was parsed
     *
     */
    @JsonProperty("DC.identifier")
    public String getDCIdentifier() {
        return dCIdentifier;
    }

    /**
     * Complete reference to the original document that was parsed
     *
     */
    @JsonProperty("DC.identifier")
    public void setDCIdentifier(String dCIdentifier) {
        this.dCIdentifier = dCIdentifier;
    }

    /**
     * ISO 639-1 or 639-2 language specification
     *
     */
    @JsonProperty("DC.language")
    public String getDCLanguage() {
        return dCLanguage;
    }

    /**
     * ISO 639-1 or 639-2 language specification
     *
     */
    @JsonProperty("DC.language")
    public void setDCLanguage(String dCLanguage) {
        this.dCLanguage = dCLanguage;
    }

    @JsonProperty("DC.subject")
    public String getDCSubject() {
        return dCSubject;
    }

    @JsonProperty("DC.subject")
    public void setDCSubject(String dCSubject) {
        this.dCSubject = dCSubject;
    }

    @JsonProperty("DC.contributors")
    public String getDCContributors() {
        return dCContributors;
    }

    @JsonProperty("DC.contributors")
    public void setDCContributors(String dCContributors) {
        this.dCContributors = dCContributors;
    }

    @JsonProperty("DC.type")
    public String getDCType() {
        return dCType;
    }

    @JsonProperty("DC.type")
    public void setDCType(String dCType) {
        this.dCType = dCType;
    }

    @JsonProperty("DC.format")
    public String getDCFormat() {
        return dCFormat;
    }

    @JsonProperty("DC.format")
    public void setDCFormat(String dCFormat) {
        this.dCFormat = dCFormat;
    }

    @JsonProperty("DC.relation")
    public String getDCRelation() {
        return dCRelation;
    }

    @JsonProperty("DC.relation")
    public void setDCRelation(String dCRelation) {
        this.dCRelation = dCRelation;
    }

    @JsonProperty("DC.coverage")
    public String getDCCoverage() {
        return dCCoverage;
    }

    @JsonProperty("DC.coverage")
    public void setDCCoverage(String dCCoverage) {
        this.dCCoverage = dCCoverage;
    }

    @JsonProperty("DC.rights")
    public String getDCRights() {
        return dCRights;
    }

    @JsonProperty("DC.rights")
    public void setDCRights(String dCRights) {
        this.dCRights = dCRights;
    }

    @JsonProperty("counts")
    public Counts getCounts() {
        return counts;
    }

    @JsonProperty("counts")
    public void setCounts(Counts counts) {
        this.counts = counts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Meta.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dCConformsTo");
        sb.append('=');
        sb.append(((this.dCConformsTo == null) ? "<null>" : this.dCConformsTo));
        sb.append(',');
        sb.append("dCSource");
        sb.append('=');
        sb.append(((this.dCSource == null) ? "<null>" : this.dCSource));
        sb.append(',');
        sb.append("dCCreated");
        sb.append('=');
        sb.append(((this.dCCreated == null) ? "<null>" : this.dCCreated));
        sb.append(',');
        sb.append("dCDate");
        sb.append('=');
        sb.append(((this.dCDate == null) ? "<null>" : this.dCDate));
        sb.append(',');
        sb.append("dCCreator");
        sb.append('=');
        sb.append(((this.dCCreator == null) ? "<null>" : this.dCCreator));
        sb.append(',');
        sb.append("dCPublisher");
        sb.append('=');
        sb.append(((this.dCPublisher == null) ? "<null>" : this.dCPublisher));
        sb.append(',');
        sb.append("dCTitle");
        sb.append('=');
        sb.append(((this.dCTitle == null) ? "<null>" : this.dCTitle));
        sb.append(',');
        sb.append("dCDescription");
        sb.append('=');
        sb.append(((this.dCDescription == null) ? "<null>" : this.dCDescription));
        sb.append(',');
        sb.append("dCIdentifier");
        sb.append('=');
        sb.append(((this.dCIdentifier == null) ? "<null>" : this.dCIdentifier));
        sb.append(',');
        sb.append("dCLanguage");
        sb.append('=');
        sb.append(((this.dCLanguage == null) ? "<null>" : this.dCLanguage));
        sb.append(',');
        sb.append("dCSubject");
        sb.append('=');
        sb.append(((this.dCSubject == null) ? "<null>" : this.dCSubject));
        sb.append(',');
        sb.append("dCContributors");
        sb.append('=');
        sb.append(((this.dCContributors == null) ? "<null>" : this.dCContributors));
        sb.append(',');
        sb.append("dCType");
        sb.append('=');
        sb.append(((this.dCType == null) ? "<null>" : this.dCType));
        sb.append(',');
        sb.append("dCFormat");
        sb.append('=');
        sb.append(((this.dCFormat == null) ? "<null>" : this.dCFormat));
        sb.append(',');
        sb.append("dCRelation");
        sb.append('=');
        sb.append(((this.dCRelation == null) ? "<null>" : this.dCRelation));
        sb.append(',');
        sb.append("dCCoverage");
        sb.append('=');
        sb.append(((this.dCCoverage == null) ? "<null>" : this.dCCoverage));
        sb.append(',');
        sb.append("dCRights");
        sb.append('=');
        sb.append(((this.dCRights == null) ? "<null>" : this.dCRights));
        sb.append(',');
        sb.append("counts");
        sb.append('=');
        sb.append(((this.counts == null) ? "<null>" : this.counts));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.dCSubject == null) ? 0 : this.dCSubject.hashCode()));
        result = ((result * 31) + ((this.dCConformsTo == null) ? 0 : this.dCConformsTo.hashCode()));
        result = ((result * 31) + ((this.dCType == null) ? 0 : this.dCType.hashCode()));
        result = ((result * 31) + ((this.counts == null) ? 0 : this.counts.hashCode()));
        result = ((result * 31) + ((this.dCRights == null) ? 0 : this.dCRights.hashCode()));
        result = ((result * 31) + ((this.dCContributors == null) ? 0 : this.dCContributors.hashCode()));
        result = ((result * 31) + ((this.dCTitle == null) ? 0 : this.dCTitle.hashCode()));
        result = ((result * 31) + ((this.dCFormat == null) ? 0 : this.dCFormat.hashCode()));
        result = ((result * 31) + ((this.dCIdentifier == null) ? 0 : this.dCIdentifier.hashCode()));
        result = ((result * 31) + ((this.dCLanguage == null) ? 0 : this.dCLanguage.hashCode()));
        result = ((result * 31) + ((this.dCSource == null) ? 0 : this.dCSource.hashCode()));
        result = ((result * 31) + ((this.dCDescription == null) ? 0 : this.dCDescription.hashCode()));
        result = ((result * 31) + ((this.dCCreated == null) ? 0 : this.dCCreated.hashCode()));
        result = ((result * 31) + ((this.dCDate == null) ? 0 : this.dCDate.hashCode()));
        result = ((result * 31) + ((this.dCPublisher == null) ? 0 : this.dCPublisher.hashCode()));
        result = ((result * 31) + ((this.dCCoverage == null) ? 0 : this.dCCoverage.hashCode()));
        result = ((result * 31) + ((this.dCCreator == null) ? 0 : this.dCCreator.hashCode()));
        result = ((result * 31) + ((this.dCRelation == null) ? 0 : this.dCRelation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Meta)) {
            return false;
        }
        Meta rhs = ((Meta) other);
        return (((((((((((((((((((this.dCSubject == rhs.dCSubject) || ((this.dCSubject != null) && this.dCSubject.equals(rhs.dCSubject))) && ((this.dCConformsTo == rhs.dCConformsTo) || ((this.dCConformsTo != null) && this.dCConformsTo.equals(rhs.dCConformsTo)))) && ((this.dCType == rhs.dCType) || ((this.dCType != null) && this.dCType.equals(rhs.dCType)))) && ((this.counts == rhs.counts) || ((this.counts != null) && this.counts.equals(rhs.counts)))) && ((this.dCRights == rhs.dCRights) || ((this.dCRights != null) && this.dCRights.equals(rhs.dCRights)))) && ((this.dCContributors == rhs.dCContributors) || ((this.dCContributors != null) && this.dCContributors.equals(rhs.dCContributors)))) && ((this.dCTitle == rhs.dCTitle) || ((this.dCTitle != null) && this.dCTitle.equals(rhs.dCTitle)))) && ((this.dCFormat == rhs.dCFormat) || ((this.dCFormat != null) && this.dCFormat.equals(rhs.dCFormat)))) && ((this.dCIdentifier == rhs.dCIdentifier) || ((this.dCIdentifier != null) && this.dCIdentifier.equals(rhs.dCIdentifier)))) && ((this.dCLanguage == rhs.dCLanguage) || ((this.dCLanguage != null) && this.dCLanguage.equals(rhs.dCLanguage)))) && ((this.dCSource == rhs.dCSource) || ((this.dCSource != null) && this.dCSource.equals(rhs.dCSource)))) && ((this.dCDescription == rhs.dCDescription) || ((this.dCDescription != null) && this.dCDescription.equals(rhs.dCDescription)))) && ((this.dCCreated == rhs.dCCreated) || ((this.dCCreated != null) && this.dCCreated.equals(rhs.dCCreated)))) && ((this.dCDate == rhs.dCDate) || ((this.dCDate != null) && this.dCDate.equals(rhs.dCDate)))) && ((this.dCPublisher == rhs.dCPublisher) || ((this.dCPublisher != null) && this.dCPublisher.equals(rhs.dCPublisher)))) && ((this.dCCoverage == rhs.dCCoverage) || ((this.dCCoverage != null) && this.dCCoverage.equals(rhs.dCCoverage)))) && ((this.dCCreator == rhs.dCCreator) || ((this.dCCreator != null) && this.dCCreator.equals(rhs.dCCreator)))) && ((this.dCRelation == rhs.dCRelation) || ((this.dCRelation != null) && this.dCRelation.equals(rhs.dCRelation))));
    }

}
