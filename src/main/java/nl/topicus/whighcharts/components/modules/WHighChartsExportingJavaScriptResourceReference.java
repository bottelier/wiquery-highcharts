package nl.topicus.whighcharts.components.modules;

import org.odlabs.wiquery.core.commons.WiQueryJavaScriptResourceReference;

public class WHighChartsExportingJavaScriptResourceReference extends
		WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighChartsExportingJavaScriptResourceReference INSTANCE =
		new WHighChartsExportingJavaScriptResourceReference();

	private WHighChartsExportingJavaScriptResourceReference()
	{
		super(WHighChartsExportingJavaScriptResourceReference.class,
			"jquery.highcharts.exporting.js");
	}

	public static WHighChartsExportingJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
