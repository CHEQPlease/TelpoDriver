package com.cheq.telpodriver

import com.common.apiutil.moneybox.MoneyBox

object TelpoDriver {
    fun openCashDrawer() {
        MoneyBox.open()
    }
}