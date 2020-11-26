import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Supplier;

@FunctionalInterface
public interface a {
  Collection<String> getNames(bu parambu, Supplier<Collection<String>> paramSupplier) throws CommandSyntaxException;
}


/* Location:              F:\dw\server.jar!\cp$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */