import android.content.context
import android.content.SharedPreferences

Class PreferenceHelper (
private val context: context)
{

    private val INTRO = "intro"
    private val NAME = "name"
    private val HOBBY = "hobby"
    private val app_prefs: SharedPreferences

    init {
        app_prefs = context.getSharedPreferences(
            "shared",
            Context.MODE_PRIVATE
        )
    }

    fun putIsLogin(loginorout: Boolean) {
        val edit = app_prefs.edit()
        edit.putBoolean(INTRO, loginorout)
        edit.commit()
    }

    fun getIsLogin(): Boolean {
        return app_prefs.getBoolean(INTRO, false)
    }

    fun putName(loginorout: String) {
        val edit = app_prefs.edit()
        edit.putString(NAME, loginorout)
        edit.commit()
    }

    fun getNames(): String? {
        return app_prefs.getString(NAME, "")
    }

    fun putHobby(loginorout: String) {
        val edit = app_prefs.edit()
        edit.putString(HOBBY, loginorout)
        edit.commit()
    }

    fun getHobbys(): String? {
        return app_prefs.getString(HOBBY, "")
    }
}