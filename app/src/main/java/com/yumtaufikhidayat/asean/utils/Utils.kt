package com.yumtaufikhidayat.asean.utils

import android.content.Context
import android.content.pm.PackageManager
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.yumtaufikhidayat.asean.R

object Utils {
    fun ImageView.loadImage(url: String?) {
        Glide.with(this.context)
            .load(url)
            .placeholder(R.color.purple_700)
            .apply(RequestOptions().override(55, 55))
            .into(this)
    }

    fun TextView.appVersion(context: Context) {
        try {
            val pInfo = context.packageManager?.getPackageInfo(context.packageName.toString(), 0)
            val appVersion = pInfo?.versionName
            this.text = appVersion
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
    }
}