cmake_minimum_required(VERSION 3.22.1)

project("ndkexample2")

add_library(utils SHARED utils.cpp)

find_library(log-lib log)