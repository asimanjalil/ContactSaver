package com.example.contactsaver

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts = createContacts()

        rvContacts.adapter = ContactAdapter(this, contacts)
        rvContacts.layoutManager = LinearLayoutManager(this)
    }



    private fun createContacts() : List<Contact>{
        val contacts = mutableListOf<Contact>()
        for (i in 1..100) contacts.add(Contact("Person #$i", i))
        return contacts
    }
}