package com.taufik.asean.ui.activity

import android.content.Intent
import android.graphics.Typeface
import android.net.Uri
import android.os.Bundle
import android.text.Html
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import com.taufik.asean.R
import com.taufik.asean.data.Country
import com.taufik.asean.databinding.ActivityDetailBinding
import com.taufik.asean.utils.Utils.loadImage

class DetailActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }

    private lateinit var country: Country

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        getParcelableData()
        setToolbar()
        setData()
    }

    private fun getParcelableData() {
        country = intent.getParcelableExtra<Country>(EXTRA_DETAIL) as Country
    }

    private fun setToolbar() {
        supportActionBar?.apply {
            title = ""
            setDisplayHomeAsUpEnabled(true)
            elevation = 0F
        }
    }

    private fun setData() {
        binding.apply {
            imgCountryFlag.loadImage(country.countryFlag, R.color.purple_700)
            tvCountryName.text = country.countryName
            tvCountryIntlName.apply {
                text = country.countryInternationalName
                setTypeface(null, Typeface.ITALIC)
            }
            tvCountryDesc.text = country.countryDescription
            tvCountryCapitalName.text = country.countryCapital
            tvCountryHeadGovName.text = country.countryHeadGovernment
            tvCountryIndependenceDayName.text = country.countryIndependenceDay
            tvCountryOfficialLanguageName.text = country.countryLanguage
            tvCountryCurrencyName.text = country.countryCurrency
            tvCountryLandAreaName.text = Html.fromHtml(String.format(getString(R.string.ms), country.countryLandArea), HtmlCompat.FROM_HTML_MODE_LEGACY)
        }
    }

    private fun openInBrowser() {
        try {
            val link = "http://setnas-asean.id/profil-negara-anggota-asean"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
            startActivity(Intent.createChooser(intent, "Open with:"))
        } catch (e: Exception) {
            Toast.makeText(
                this,
                "Silakan install browser terlebih dahulu",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
            R.id.action_open_in_browser -> openInBrowser()
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {
        const val EXTRA_DETAIL = "com.taufik.asean.ui.activity.EXTRA_DETAIL"
    }
}