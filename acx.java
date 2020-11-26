import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface acx<K, T extends acx<K, T>> {
  @Nullable
  T a();
  
  void a(K paramK, BiConsumer<K, T> paramBiConsumer);
}


/* Location:              F:\dw\server.jar!\acx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */