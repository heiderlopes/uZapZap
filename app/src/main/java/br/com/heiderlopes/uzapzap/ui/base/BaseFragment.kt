package br.com.heiderlopes.uzapzap.ui.base

import android.support.annotation.StringRes
import android.support.v4.app.Fragment

open abstract class BaseFragment : Fragment() {
    @StringRes
    abstract fun getTitulo(): Int
}