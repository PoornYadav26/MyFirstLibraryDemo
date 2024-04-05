#SnackBar-Library-Demo

Step 1. Add the JitPack repository to your build file
repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}

Step 2. Add the dependency
  dependencies {
	        implementation 'com.github.PoornYadav26:MyFirstLibraryDemo:v1.0.0'
	}

 Example :
 MySnackyBar.showSnackbar(rootView, "This is a test message!!")
