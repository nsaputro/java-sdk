package com.constantcontact.components.emailcampaigns;

import java.io.Serializable;

import com.constantcontact.components.Component;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TODO: add doc
 * 
 * @author ConstantContact
 */
public class ClickThroughDetails extends Component implements Serializable {

	/**
	 * Serial version unique identifier.
	 */
	private static final long serialVersionUID = 5085211762805808290L;

	@JsonIgnore
	private String url;

	@JsonIgnore
	private String urlUid;
	
	@JsonIgnore
	private String clickCount;

	/**
	 * Default constructor.
	 */
	public ClickThroughDetails() {
		super();
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("url_uid")
	public String getUrlUid() {
		return urlUid;
	}

	public void setUrlUid(String url_uid) {
		this.urlUid = url_uid;
	}

	@JsonProperty("click_count")
	public String getClickCount() {
		return clickCount;
	}

	public void setClickCount(String click_count) {
		this.clickCount = click_count;
	}

	@Override
    public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("ClickThroughDetails [");
	    if (url != null)
		    builder.append("url=").append(url).append(", ");
	    if (urlUid != null)
		    builder.append("url_uid=").append(urlUid).append(", ");
	    if (clickCount != null)
		    builder.append("click_count=").append(clickCount);
	    builder.append("]");
	    return builder.toString();
    }
}
