package xyz.a1api.tools.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import xyz.a1api.tools.LStorage

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //初始化数据同时开始监听
        content1.observeAndInit {
            contentListenEditText.setText(it)
        }
        content1.observe { }

        switchButton.setOnClickListener {
            //保存数据
            content1.set(contentListenEditText.text.toString())

            LStorage.SP.putString("contentCache", contentCacheEditText.text.toString())
            startActivity(Intent(this, LanguageActivity::class.java))
        }

    }

    override fun onResume() {
        super.onResume()
        contentCacheEditText.setText(LStorage.SP.getString("contentCache"))
    }
}
