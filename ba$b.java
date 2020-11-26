import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

@FunctionalInterface
public interface b<T extends Number, R extends ba<T>> {
  R create(StringReader paramStringReader, @Nullable T paramT1, @Nullable T paramT2) throws CommandSyntaxException;
}


/* Location:              F:\dw\server.jar!\ba$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */