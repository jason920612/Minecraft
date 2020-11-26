import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface ul extends Closeable {
  InputStream a(um paramum, pc parampc) throws IOException;
  
  Collection<pc> a(um paramum, String paramString, int paramInt, Predicate<String> paramPredicate);
  
  boolean b(um paramum, pc parampc);
  
  Set<String> a(um paramum);
  
  @Nullable
  <T> T a(up<T> paramup) throws IOException;
  
  String a();
}


/* Location:              F:\dw\server.jar\\ul.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */