import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public interface a {
  si a(CommandContext<bu> paramCommandContext) throws CommandSyntaxException;
  
  ArgumentBuilder<bu, ?> a(ArgumentBuilder<bu, ?> paramArgumentBuilder, Function<ArgumentBuilder<bu, ?>, ArgumentBuilder<bu, ?>> paramFunction);
}


/* Location:              F:\dw\server.jar!\sj$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */