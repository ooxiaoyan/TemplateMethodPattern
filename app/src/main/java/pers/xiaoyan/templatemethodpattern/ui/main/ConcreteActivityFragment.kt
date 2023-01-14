package pers.xiaoyan.templatemethodpattern.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pers.xiaoyan.templatemethodpattern.R

class ConcreteActivityFragment : Fragment() {

    companion object {
        fun newInstance() = ConcreteActivityFragment()
    }

    private lateinit var viewModel: ConcreteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[ConcreteViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

}