# android-splash-screen-samples
Android 应用启动图的各种实现方式示例

## `Handler`倒数跳转的方式
用作启动图的那个`Activity`的布局就是启动图，启动后使用`Handler`或者类似的方式实现倒数，倒数一定时间后跳转到主界面

代码见[ActivityHandler](./ActivityHandler)

## 设置主题的方式
在用户点击应用图标到`Activity`的`onCreate`开始调用之前会有一小段时间间隔，这段时间是应用的冷启动时间，具体表现为应用会出现一小段时间的白屏，然后再进入主界面。这种方式正是利用了应用的冷启动，将出现的白屏替换成一张图片的方式来实现启动图。

代码见[Theme](./Theme)

## 设置了启动图主题的专用`Activity`的方式
实现方式跟上一种基本一样，不过需要另外新建一个`Activity`，然后把应用的主`Activity`改为新建的这个`Activity`，并给它设置上面的启动图主题。在`onCreate`里面不再渲染布局，而是直接启动`MainActivity`（不一定是`MainActivity`，反正是你的主界面的那个`Activity`）。

代码见[ThemeActivity](./ThemeActivity)

## 将`windowBackground`属性设置为透明的方式
具体实现和使用`Handler`的方式基本一样，不一样的地方是把`Activity`主题里面的`windowBackground`修改掉，把它改成透明的。

代码见[WindowBackgroundTransparent](./WindowBackgroundTransparent)

## 知乎启动图的实现方式
知乎的启动图用的是第二种方法，即“设置了启动图主题的专用`Activity`的方式”

代码见[ZhiHuSplashScreen](./ZhiHuSplashScreen)
