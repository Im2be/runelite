import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("cz")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("cr")
	@Export("removeDual")
	public void removeDual() {
		if (this.nextDual != null) { // L: 9
			this.nextDual.previousDual = this.previousDual; // L: 10
			this.previousDual.nextDual = this.nextDual; // L: 11
			this.previousDual = null; // L: 12
			this.nextDual = null; // L: 13
		}
	} // L: 14
}
