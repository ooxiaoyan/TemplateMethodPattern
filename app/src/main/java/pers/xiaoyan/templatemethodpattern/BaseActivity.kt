package pers.xiaoyan.templatemethodpattern

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// 抽象模版
abstract class BaseActivity : AppCompatActivity() {

    // 模版方法
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupViewModel()
        setupViews()
        initObservers()
    }

    // 基本方法
    protected open fun setupViewModel() {}

    // 基本方法
    protected open fun setupViews() {}

    // 基本方法
    protected open fun initObservers() {}
}