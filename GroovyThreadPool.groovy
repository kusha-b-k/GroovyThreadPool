/**
 * Created by kusha bk
 */
//import the package
import java.util.concurrent.Callable
import java.util.concurrent.Executors



def mThread = { mNumber -> println "pool GRooVY PooL ${ mNumber }"}


def mPoolThread = Executors.newFixedThreadPool(3)
try {
            def futures = (0..100).collect{ mNumber->

            mPoolThread.submit({->
                sleep(100)
            mThread mNumber } as Callable);

    }
    futures.each{ it.get() }

}
finally
        {
            mPoolThread.shutdown()
        }
