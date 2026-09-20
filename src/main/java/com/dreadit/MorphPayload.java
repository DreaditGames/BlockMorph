package com.dreadit;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;

public record MorphPayload(String variantName, boolean morphAll) implements CustomPacketPayload {
    public static final CustomPacketPayload.Type<MorphPayload> ID = new CustomPacketPayload.Type<>(Identifier.fromNamespaceAndPath("blockmorph", "morph"));

    // Tells the game how to send both the string and the boolean over the network
    public static final StreamCodec<FriendlyByteBuf, MorphPayload> CODEC = StreamCodec.of(
            (buf, payload) -> {
                buf.writeUtf(payload.variantName());
                buf.writeBoolean(payload.morphAll());
            },
            buf -> new MorphPayload(buf.readUtf(), buf.readBoolean())
    );

    @Override
    public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
        return ID;
    }
}