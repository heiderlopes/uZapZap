package br.com.heiderlopes.uzapzap.ui.status


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.heiderlopes.uzapzap.R
import br.com.heiderlopes.uzapzap.ui.base.BaseFragment

class StatusFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_status, container, false)
    }

    override fun getTitulo(): Int {
        return R.string.tab_titulo_status
    }
}
