package com.wjn.testdemo;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

public class LaunchSettings extends UiAutomatorTestCase {
    private UiDevice mDevice;
    // TODO 重要注意： 在运行该测试代码的时候 需要先把手机语言环境设置为英文。
    public void testDemo() throws UiObjectNotFoundException {

        mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        mDevice.pressHome();
        mDevice.pressHome();
        UiObject x=mDevice.findObject(new UiSelector().text("闲鱼"));
        x.click();
    }
}
