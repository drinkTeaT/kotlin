package base

// 定义一个接口,和一个方法 show()
interface IBase {
    fun show()
}

// 定义类实现 Base 接口, 并实现 show 方法
open class BaseImpl : IBase {
    override fun show() {
        print("BaseImpl::show()")
    }
}

// 定义代理类实现 Base 接口, 构造函数参数是一个 Base 对象
// by 后跟 Base 对象, 不需要再实现 show()
class BaseProxy(base: IBase) : IBase by base

// main 方法
fun main(args: Array<String>) {
    val base = BaseImpl()
    BaseProxy(base).show()
}