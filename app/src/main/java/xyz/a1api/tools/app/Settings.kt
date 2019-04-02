package xyz.a1api.tools.app

import xyz.a1api.tools.LStorage

/**
 * Created by Cat-x on 2018/8/7.
 * For MangaReadEngine
 * Cat-x All Rights Reserved
 */

val showTwoToolbar by LStorage.SP.preferenceBoolean(true)
val tappingEnabled by LStorage.SP.preferenceBoolean(true)

val content1 by LStorage.SP.preferenceString("该文本框可以进行内容变化监听;\n这个是LStorage的初始数据1")
val content2 by LStorage.SP.preferenceString("这个是LStorage的初始数据2")


