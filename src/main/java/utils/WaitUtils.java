package utils;

import ru.stqa.trier.LimitExceededException;
import ru.stqa.trier.TimeBasedTrier;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import static org.awaitility.Awaitility.await;

public class WaitUtils {

    public static <T> T tryTo(Supplier<T> supplier, long duration, long interval) throws Exception {
        try {
            return new TimeBasedTrier<>(duration, interval).tryTo(supplier);
        } catch (LimitExceededException | InterruptedException e) {
            throw new Exception(e.getMessage());
        }
    }

    public static void waitFor(Runnable runnable){
        await().atMost(3,TimeUnit.SECONDS).until(() ->
                {
                    try {
                        runnable.run();
                        return true;
                    } catch (Exception e) {
                        return false;
                    }
                }
        );
    }
}
