'use strict';
const src = __dirname + "/src";
const dist = __dirname + "/dist"
const HtmlWebpackPlugin = require('html-webpack-plugin');
const springUrl = 'http://localhost:8080';

module.exports = {
  mode: 'development',
  context: src,
  devtool: 'source-map',
  entry: './Index.tsx',
  devServer: {
    contentBase: dist,
    port: 8081,
    proxy: {
        '/api':  { target: springUrl },
        '/view': { target: springUrl },
        '/css':  { target: springUrl }
    }
  },
  module: {
    rules: [
      {
        test: /\.tsx?$/,
        loader: 'ts-loader'
      },
      {
        test: /\.html$/,
        loader: "html-loader"
      }
    ]
  },
  resolve: {
    extensions: ['.ts', '.tsx', '.js']
  },
  plugins: [
    new HtmlWebpackPlugin({
      template: "./html/index.html"
    })
  ]
};