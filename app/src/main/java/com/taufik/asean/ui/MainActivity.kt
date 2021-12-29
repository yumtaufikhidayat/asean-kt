package com.taufik.asean.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.taufik.asean.R
import com.taufik.asean.data.CountriesData
import com.taufik.asean.data.Country
import com.taufik.asean.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var countryAdapter: CountryAdapter
    private var listCountries: ArrayList<Country> = arrayListOf()
    private var title: String = "Negara-Negara ASEAN"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setActionBarTitle(title)
        showData()
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showData() {
        listCountries.addAll(CountriesData.listData)
        countryAdapter = CountryAdapter(listCountries)
        binding.apply {
            with(rvMain) {
                layoutManager = LinearLayoutManager(this@MainActivity)
                adapter = countryAdapter
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_about -> {

            }
        }
        return super.onOptionsItemSelected(item)
    }
}