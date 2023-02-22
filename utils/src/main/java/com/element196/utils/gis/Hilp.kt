package com.element196.utils.gis

import android.content.res.Resources
import androidx.core.net.toUri
import com.element196.utils.R
import com.element196.utils.element.GOpd

class Hilp(
    private val hdth: Resources
) {
    fun ios(
        rehgtr: String,
        yht: String,
        resultF: String,
        GOpd: GOpd?,
        resultU: String,
        time:String
    ) = "https://" + fergtr().buildUpon().apply {
        appendQueryParameter(
            hdth.getString(R.string.grethtr),
            hdth.getString(R.string.grrh)
        )
        appendQueryParameter(
            hdth.getString(R.string.gvdbt),
            time
        )
        appendQueryParameter(hdth.getString(R.string.hdbft), rehgtr)
        appendQueryParameter(hdth.getString(R.string.hrte), yht)
        appendQueryParameter(
            hdth.getString(R.string.hbtrh),
            resultF
        )
        appendQueryParameter(
            hdth.getString(R.string.greg), resultU
        )
        appendQueryParameter(
            hdth.getString(R.string.yhgrg),
            "null"
        )
        appendQueryParameter(
            hdth.getString(R.string.srgtrh),
            GOpd?.sdg.toString()
        )
        appendQueryParameter(
            hdth.getString(R.string.yhtrh),
            GOpd?.gsd.toString()
        )
        appendQueryParameter(
            hdth.getString(R.string.rhtr),
            GOpd?.db.toString()
        )
        appendQueryParameter(hdth.getString(R.string.hrrth), GOpd?.rgs.toString())
        appendQueryParameter(
            hdth.getString(R.string.yhythty),
            "null"
        )
        appendQueryParameter(
            hdth.getString(R.string.freg),
            "null"
        )
    }.toString()

    private fun fergtr() = grthgtrh().toUri()

    private fun grthgtrh() = "gonzosarmour.store/gonzo.php"
}