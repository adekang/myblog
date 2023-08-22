// uno.config.ts
import {
  defineConfig,
  presetAttributify,
  presetIcons,
  presetUno,
  transformerDirectives,
  transformerVariantGroup,
} from 'unocss'

export default defineConfig({
  shortcuts: {},
  presets: [
    presetUno(),
    presetAttributify(),
    presetIcons({
      scale: 1.2,
      warn: true,
    }),
  ],
  theme: {
    colors: {
      primary: '#1e80ff',
    },
    fontFamily: {
      sans: 'DM Sans',
      serif: 'DM Serif Display',
      mono: 'DM Mono',
    },
  },
  transformers: [
    transformerDirectives(),
    transformerVariantGroup(),
  ],
})
