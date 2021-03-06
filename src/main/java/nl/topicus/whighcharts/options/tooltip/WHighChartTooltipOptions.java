package nl.topicus.whighcharts.options.tooltip;

import java.io.Serializable;

import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteSerializer;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartTooltipOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	@JsonSerialize(using = ToStringNoQuoteSerializer.class)
	private String formatter;

	public String getFormatter()
	{
		return formatter;
	}

	public void setFormatter(String formatter)
	{
		this.formatter = formatter;
	}

}
