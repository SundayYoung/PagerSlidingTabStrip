# PagerSlidingTabStrip
PagerSlidingTabStrip 可自定底线跟Tab同宽度


    <com.felix.library.PagerSlidingTabStrip
        android:id="@+id/vTlTab"
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:background="@color/white"
        app:pstsIndicatorColor="@color/colorPrimary"
        app:pstsIndicatorHeight="2dp"
        app:pstsShouldExpand="true"
        app:pstsTextSelectedBold="true"
        app:pstsTextSelectedColor="@color/colorPrimary"
        app:pstsTextSize="15sp"
        app:pstsUnderlineHeight="1dp"
        app:pstsMaxIndicatorLineWidth="70dp"/>
        
        
主要是 `app:pstsMaxIndicatorLineWidth="70dp"` 填写设计给出的数值，即可正确匹配等宽效果。
其他用法和 PagerSlidingTabStrip 类似。


## 引入方法

#### 1.根 build.gradle 添加：


    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
#### 2.dependency 引入


    dependencies {
	        implementation 'com.github.SundayYoung:PagerSlidingTabStrip:1.0.1'
	}
