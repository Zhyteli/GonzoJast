package com.element196.utils.gis

import android.content.res.Resources
import androidx.core.net.toUri
import com.element196.utils.R
import com.element196.utils.element.Naming

class Hilp(
    private val res: Resources
) {
    fun ios(
        gadid: String,
        fData: String,
        resultF: String,
        naming: Naming?,
        resultU: String,
        time:String
    ) = "https://" + "gonzosarmour.store/gonzo.php".toUri().buildUpon().apply {
        appendQueryParameter(
            res.getString(R.string.secure_get_parametr),
            res.getString(R.string.secure_key)
        )
        appendQueryParameter(
            res.getString(R.string.dev_tmz_key),
            time
        )
        appendQueryParameter(res.getString(R.string.gadid_key), gadid)
        appendQueryParameter(res.getString(R.string.deeplink_key), fData)
        appendQueryParameter(
            res.getString(R.string.source_key),
            resultF
        )
        appendQueryParameter(
            res.getString(R.string.af_id_key), resultU
        )
        appendQueryParameter(
            res.getString(R.string.adset_id_key),
            "null"
        )
        appendQueryParameter(
            res.getString(R.string.campaign_id_key),
            naming?.campaign_id.toString()
        )
        appendQueryParameter(
            res.getString(R.string.app_campaign_key),
            naming?.campaign_group_name.toString()
        )
        appendQueryParameter(
            res.getString(R.string.adset_key),
            naming?.ad_objective_name.toString()
        )
        appendQueryParameter(res.getString(R.string.adgroup_key), naming?.adgroup_name.toString())
        appendQueryParameter(
            res.getString(R.string.orig_cost_key),
            "null"
        )
        appendQueryParameter(
            res.getString(R.string.af_siteid_key),
            "null"
        )
    }.toString()
}