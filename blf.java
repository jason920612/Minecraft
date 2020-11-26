import com.google.common.collect.ImmutableMap;
import java.util.Collection;

public interface blf<C> {
  Collection<bmm<?>> a();
  
  <T extends Comparable<T>> boolean b(bmm<T> parambmm);
  
  <T extends Comparable<T>> T c(bmm<T> parambmm);
  
  <T extends Comparable<T>, V extends T> C a(bmm<T> parambmm, V paramV);
  
  <T extends Comparable<T>> C a(bmm<T> parambmm);
  
  ImmutableMap<bmm<?>, Comparable<?>> b();
}


/* Location:              F:\dw\server.jar!\blf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */