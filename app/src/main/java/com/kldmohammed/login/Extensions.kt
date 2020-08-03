package com.kldmohammed.login

import android.app.Activity
import android.util.Patterns
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


/** a function to get text from edit text*/
fun EditText.asString(): String {
    return text.toString()
}

/** a function to validate a string if it is a valid or not*/
fun String.isValidEmail() = Patterns.EMAIL_ADDRESS.matcher(this).matches()

/** a function to validate a string if it is a valid or not*/
fun String.isValidPassword() = isNotEmpty() && length > 4

/** a function to show a toast with a simple syntax*/
fun Activity.toast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

/** a function to show a snackBar with a simple syntax*/
fun View.snackBar(msg: String) = Snackbar.make(this, msg, Snackbar.LENGTH_LONG).show()