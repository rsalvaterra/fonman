package org.rsalvaterra.fon;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public final class SettingsActivity extends PreferenceActivity implements OnClickListener, OnPreferenceChangeListener, OnPreferenceClickListener {

	private Preference getPreference(final int id) {
		return getPreferenceScreen().findPreference(getString(id));
	}

	private void setOnPreferenceChangeListener(final int id, final String v) {
		final Preference p = getPreference(id);
		p.setOnPreferenceChangeListener(this);
		onPreferenceChange(p, FonManService.getPreference(p.getContext(), id, v));
	}

	private void setOnPreferenceClickListener(final int id) {
		getPreference(id).setOnPreferenceClickListener(this);
	}

	@Override
	public void onClick(final DialogInterface d, final int w) {
		d.dismiss();
	}

	@Override
	public void onCreate(final Bundle b) {
		super.onCreate(b);
		addPreferencesFromResource(R.layout.settings);
		setOnPreferenceChangeListener(R.string.pref_period, Constants.DEFAULT_PERIOD);
		setOnPreferenceChangeListener(R.string.pref_rssi, Constants.DEFAULT_MINIMUM_RSSI);
		setOnPreferenceChangeListener(R.string.pref_success, "");
		setOnPreferenceChangeListener(R.string.pref_failure, "");
		setOnPreferenceClickListener(R.string.pref_about);
	}

	@Override
	public boolean onPreferenceChange(final Preference p, final Object v) {
		final Context c = p.getContext();
		final String k = p.getKey();
		String s;
		if (k.equals(c.getString(R.string.pref_period))) {
			s = c.getString(R.string.periodSummary, v);
		} else if (k.equals(c.getString(R.string.pref_rssi))) {
			s = c.getString(R.string.rssiSummary, v);
		} else {
			s = (String) v;
			if (s.length() != 0) {
				s = RingtoneManager.getRingtone(c, Uri.parse(s)).getTitle(c);
			}
		}
		p.setSummary(s);
		return true;
	}

	@Override
	public boolean onPreferenceClick(final Preference p) {
		final Context c = p.getContext();
		((TextView) new Builder(c).setIcon(R.drawable.ic_launcher).setTitle(R.string.app_name).setMessage(Html.fromHtml(c.getString(R.string.app_credits, c.getString(R.string.app_copyright), c.getString(R.string.app_source)))).setNeutralButton(R.string.accept, this).show().findViewById(android.R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());
		return true;
	}

}
