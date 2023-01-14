package pers.xiaoyan.templatemethodpattern

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import pers.xiaoyan.templatemethodpattern.ui.main.ConcreteActivityFragment
import pers.xiaoyan.templatemethodpattern.ui.main.ConcreteActivityViewModel

class ConcreteActivity : BaseActivity() {

    private lateinit var vm: ConcreteActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ConcreteActivityFragment.newInstance())
                .commitNow()
        }
    }

    override fun setupViews() {
        setContentView(R.layout.activity_concrete_activity)
    }

    override fun setupViewModel() {
        super.setupViewModel()
        vm = ViewModelProvider(this)[ConcreteActivityViewModel::class.java]
    }
}