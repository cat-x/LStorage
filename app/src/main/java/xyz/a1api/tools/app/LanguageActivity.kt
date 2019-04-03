package xyz.a1api.tools.app

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_language.*
import xyz.a1api.tools.LStorage

/**
 * Created by Cat-x on 2019/4/1.
 * For LStorage
 * Cat-x All Rights Reserved
 */
class LanguageActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)
        backButton.setOnClickListener { onBackPressed() }

        //获取缓存数据
        contentListenEditText2.setText(content1.get())


        contentCacheEditText2.setText(LStorage.SP.getString("contentCache", contentCacheEditText2.text.toString()))
    }

    override fun onBackPressed() {
        super.onBackPressed()
        content1.set(contentListenEditText2.text.toString())
        LStorage.SP.putString("contentCache", contentCacheEditText2.text.toString())
    }
}
