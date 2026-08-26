package com.emeraldingot.demo.mixin;


import joptsimple.OptionSet;
import net.minecraft.client.main.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Main.class)
public class ClientMainMixin {
	@Redirect(method = "main", at = @At(
			value = "INVOKE",
			target = "Ljoptsimple/OptionSet;has(Ljava/lang/String;)Z"
	))
	private static boolean modifyDemo(OptionSet optionSet, String option) {
		if (option.equals("demo")) {
			return true;
		}
		else {
			return optionSet.has(option);
		}
	}
}