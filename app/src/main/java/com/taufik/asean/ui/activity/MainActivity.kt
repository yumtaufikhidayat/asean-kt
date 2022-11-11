package com.taufik.asean.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.taufik.asean.R
import com.taufik.asean.data.CountriesData
import com.taufik.asean.data.Country
import com.taufik.asean.databinding.ActivityMainBinding
import com.taufik.asean.ui.adapter.CountryAdapter

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val countryAdapter by lazy { CountryAdapter() }
    private var listCountries: ArrayList<Country> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setActionBarTitle()
        showData()
    }

    private fun setActionBarTitle() {
        supportActionBar?.title = getString(R.string.textHeaderTitle)
    }

    private fun showData() {
        listCountries.addAll(CountriesData.listData)
        binding.rvMain.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = countryAdapter
            countryAdapter.submitList(listCountries)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_about -> {
                startActivity(Intent(this, ProfileActivity::class.java))
            }
        }
        return super.onOptionsItemSelected(item)
    }
}