import * as path from 'node:path'
import { defineConfig, loadEnv } from 'vite'
import UnoCSS from 'unocss/vite'
import react from '@vitejs/plugin-react'

// https://vitejs.dev/config/
export default defineConfig(({ mode }) => {
  // eslint-disable-next-line n/prefer-global/process
  const env = loadEnv(mode, process.cwd())

  console.log(mode, env)
  return {
    base: env.VITE_APP_BASE,
    resolve: {
      alias: {
        '@': path.resolve(__dirname, 'src'),
      },
      extensions: ['.js', '.ts', '.tsx'],
    },
    plugins: [UnoCSS(), react()],
    server: {
      proxy: {
        [env.VITE_APP_BASE_API]: {
          target: env.VITE_APP_BASE_URL,
          changeOrigin: true,
          rewrite: path => path.replace(new RegExp(`^${env.VITE_APP_BASE_API}`), ''),
        },
      },
    },
  }
})
