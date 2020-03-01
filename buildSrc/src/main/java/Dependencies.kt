import Versions.CHUCK_VERSION
import Versions.COROUTINES_VERSION
import Versions.HYPERION_VERSION
import Versions.KOIN_VERSION
import Versions.LIFE_CYCLE_VERSION
import Versions.NAVIGATION_VERSION
import Versions.OBJECT_BOX_VERSION
import Versions.OK_HTTP_VERSION
import Versions.RETROFIT_VERSION

object ApplicationId {
    const val ID = "com.androidjobs"
}

object Releases {
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
}

object Versions {
    const val BUILD_TOOLS_VERSION = "29.0.2"
    const val MIN_SDK_VERSION = 21
    const val TARGET_SDK_VERSION = 29
    const val COMPILE_SDK_VERSION = 29

    const val RETROFIT_VERSION = "2.7.1"
    const val OK_HTTP_VERSION = "4.4.0"
    const val COROUTINES_VERSION = "1.2.1"
    const val OBJECT_BOX_VERSION = "2.5.1"
    const val LIFE_CYCLE_VERSION = "2.2.0"
    const val NAVIGATION_VERSION = "2.2.0"
    const val KOIN_VERSION = "2.1.0"
    const val CHUCK_VERSION = "1.1.0"
    const val HYPERION_VERSION = "0.9.27"
}

object Libraries {
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.50"
    const val APP_COMPAT = "androidx.appcompat:appcompat:1.1.0"
    const val CORE_KTX = "androidx.core:core-ktx:1.2.0"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val JUNIT = "junit:junit:4.12"
    const val TEST_RUNNER = "androidx.test:runner:1.2.0"
    const val TEST_ESPRESSO = "androidx.test.espresso:espresso-core:3.2.0"
    const val MATERIAL = "com.google.android.material:material:1.1.0"
    const val SWIPE_REFRESH = "androidx.swiperefreshlayout:swiperefreshlayout:1.0.0"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:$RETROFIT_VERSION"
    const val CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:$RETROFIT_VERSION"

    const val OK_HTTP = "com.squareup.okhttp3:okhttp:$OK_HTTP_VERSION"
    const val OK_HTTP_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:$OK_HTTP_VERSION"

    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$COROUTINES_VERSION"

    const val OBJECT_BOX_BROWSER = "io.objectbox:objectbox-android-objectbrowser:$OBJECT_BOX_VERSION"
    const val OBJECT_BOX_DEBUG = "io.objectbox:objectbox-android:$OBJECT_BOX_VERSION"

    const val LIFE_CYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:$LIFE_CYCLE_VERSION"
    const val LIFE_CYCLE_COMMON_JAVA_8 = "androidx.lifecycle:lifecycle-common-java8:$LIFE_CYCLE_VERSION"
    const val LIFE_CYCLE_VIEW_MODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LIFE_CYCLE_VERSION"

    const val NAVIGATION_FRAGMENT_KTX = "androidx.navigation:navigation-fragment-ktx:$NAVIGATION_VERSION"
    const val NAVIGATION_UI_KTX = "androidx.navigation:navigation-ui-ktx:$NAVIGATION_VERSION"

    const val KOIN_SCOPE = "org.koin:koin-androidx-scope:$KOIN_VERSION"
    const val KOIN_VIEW_MODEL = "org.koin:koin-androidx-viewmodel:$KOIN_VERSION"

    const val CHUCK = "com.readystatesoftware.chuck:library:$CHUCK_VERSION"
    const val CHUCK_NO_OP = "com.readystatesoftware.chuck:library-no-op:$CHUCK_VERSION"

    const val HYPERION_CORE = "com.willowtreeapps.hyperion:hyperion-core:$HYPERION_VERSION"
    const val HYPERION_CORE_NO_OP = "com.willowtreeapps.hyperion:hyperion-core-no-op:$HYPERION_VERSION"
    const val HYPERION_ATTR = "com.willowtreeapps.hyperion:hyperion-attr:$HYPERION_VERSION"
    const val HYPERION_BUILD_CONFIG = "com.willowtreeapps.hyperion:hyperion-build-config:$HYPERION_VERSION"
    const val HYPERION_CRASH = "com.willowtreeapps.hyperion:hyperion-crash:$HYPERION_VERSION"
    const val HYPERION_DISK = "com.willowtreeapps.hyperion:hyperion-disk:$HYPERION_VERSION"
    const val HYPERION_PHOENIX = "com.willowtreeapps.hyperion:hyperion-phoenix:$HYPERION_VERSION"
    const val HYPERION_MEASUREMENT = "com.willowtreeapps.hyperion:hyperion-measurement:$HYPERION_VERSION"
    const val HYPERION_SHARED_PREFERENCES = "com.willowtreeapps.hyperion:hyperion-shared-preferences:$HYPERION_VERSION"
    const val HYPERION_TIMBER = "com.willowtreeapps.hyperion:hyperion-timber:$HYPERION_VERSION"
}