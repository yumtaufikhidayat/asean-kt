package com.taufik.asean.ui.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.taufik.asean.R
import com.taufik.asean.databinding.ActivityProfileBinding


class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setToolbar()

        setProfileData()
    }

    private fun setToolbar() {
        supportActionBar?.apply {
            title = "Profil"
            setDisplayHomeAsUpEnabled(true)
        }
    }

    @SuppressLint("CheckResult")
    private fun setProfileData() {
        binding.apply {
            Glide.with(this@ProfileActivity)
                .load(R.drawable.pp_taufik)
                .apply(RequestOptions()
                        .fitCenter()
                        .format(DecodeFormat.PREFER_ARGB_8888)
                        .override(Target.SIZE_ORIGINAL))
                .into(imgProfilePhoto)

            tvProfileName.text = getString(R.string.textProfileName)
            tvProfileEmail.text = getString(R.string.textProfileEmail)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}