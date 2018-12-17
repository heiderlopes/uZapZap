package br.com.heiderlopes.uzapzap.ui.chamadas


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.heiderlopes.uzapzap.R
import br.com.heiderlopes.uzapzap.ui.base.BaseFragment

class ChamadasFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_chamadas, container, false)
    }

    override fun getTitulo(): Int {
        return R.string.tab_titulo_chamadas
    }
}
