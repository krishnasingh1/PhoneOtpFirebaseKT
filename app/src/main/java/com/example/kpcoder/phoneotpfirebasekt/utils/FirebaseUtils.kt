package com.example.kpcoder.phoneotpfirebasekt.utils

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

object FirebaseUtils {

    val auth: FirebaseAuth = FirebaseAuth.getInstance()
    val firebaseUser: FirebaseUser? = auth.currentUser
}