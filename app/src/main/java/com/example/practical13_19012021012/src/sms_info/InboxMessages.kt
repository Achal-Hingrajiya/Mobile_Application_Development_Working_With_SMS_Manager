package com.example.practical13_19012021012.src.sms_info

class InboxMessages (var contactNo : String, var body : String){

    var id = idGeneration()

    companion object {

        var id = 0

        fun idGeneration(): Int {
            id += 1
            return id
        }
        
        fun addSMS(sms : InboxMessages){
            inboxSmsArr.add(sms)
        }
        var inboxSmsArr: ArrayList<InboxMessages> = ArrayList()
    }
}